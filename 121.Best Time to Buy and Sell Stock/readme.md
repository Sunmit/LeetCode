第一想法是双重循环，但时间复杂度会很糟糕
然后看看双重循环中哪部分是重复计算可以舍去的，发现后面的数减前面的数，只需减最小的那个值就行。
所以设中间变量low 一次循环搞定。