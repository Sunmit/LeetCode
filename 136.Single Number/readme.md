想用o(n)并且不用多余的memory解决该问题，想过排序等方式，时间复杂度都无法满足要求。要消掉所有重复的数字，想到了异或（^） 同为0 不同为1的特点，就所有数字遍历异或。