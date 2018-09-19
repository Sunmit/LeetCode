思路：遇到树问题首先想到递归。
长度判断：根据题目要求，最短路径是子节点的两个leaf都是空的长度，所以[1,2]的最短depth是2。
所以递归的左depth 右depth 两个高度一个为0时取另一个 都不为0 取较短的。

合理设计方法，可省去minDepth(Node node,int depth)递归函数的参数int depth
