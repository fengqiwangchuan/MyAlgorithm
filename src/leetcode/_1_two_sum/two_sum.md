#  1.Two Sum解题思路  
##  官网题解  
### https://leetcode.com/articles/two-sum/  

> 做的时候首先想到的就是BF算法 简单粗暴 但是时间复杂度高  

> 接着会去思考是否能用空间换取时间  

##  1.BF  
双层for循环  
*   时间复杂度O(n^2)  
*   空间复杂度O(1)  

##  2.采取hash table  
优化BF  

*   时间复杂度O(n)  

*   空间复杂度O(n)  

java 提供 hashmap集合 实现映射  

这里将数组值与其索引相互对应  

哈希表是一种根据关键码去寻找值的数据映射结构  

hashmap的查询 时间复杂度为O(1)  

首先想到的是先将数组中的值与其索引存入hashmap  

取数组中的每个值 目标值减去当前值 查询哈希表中是否存在差值 并且 不能是当前的值  

最后返回 当前i 与 找到的索引  

因为是顺序查找的 所以 i 在前  

若没有找到 抛出参数异常  

两次循环  
```
public static int[] twoSum1(int[] array, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
        hashMap.put(array[i], i);
    }
    for (int i = 0; i < array.length; i++) {
        int need = target - array[i];
        if (hashMap.containsKey(need) && hashMap.get(need) != i) {
            return new int[]{i, hashMap.get(need)};
        }
    }
    throw new IllegalArgumentException("not exist target");
}
```

##  3.一轮hash  

一次循环  
*   时间复杂度O(n)  
*   空间复杂度O(n)  

在插入前进行判断  

拿样例举例 array[0] 为 2 hashmap中还没有值 故继续迭代 array[1] 为 7 target为9 need 为2  

理解为向已存在的hastmap搜索 故找到了在它之前的 2  

因为 2 的索引小 故当前 i 在后  

```
public static int[] twoSum2(int[] array, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
        int need = target - array[i];
        if (hashMap.containsKey(need) && hashMap.get(need) != i) {
            return new int[]{hashMap.get(need), i};
        }
    }
    throw new IllegalArgumentException("no solution");
}   
```

*   https://leetcode-cn.com/problems/two-sum/  