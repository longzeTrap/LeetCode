class Solution {
    public String longestCommonPrefix(String[] strs) {
        
    if (strs == null || strs.length == 0)
	    return "";

    String pre = strs[0];
    int i = 1;

    while(i < strs.length)
    {
	    while( strs[i].indexOf(pre) != 0 )  //只有在pre是strs[i]的子字符串，且位于开始位置才不执行循环
	    {
		    pre = pre.substring( 0, pre.length() - 1 );
	    }
	++i;
    }
    return pre;    
    }
}

/*
题目:给一个字符串数组，找出字符串数组各元素包含的最大子字符串,并返回。若没有共同包含子字符串，则返回""

s1:判断字符串数组是否为空，若为空，则返回""
s2:pre = strs[0],pre即是共同包含的子字符串
s3:第一个while，将pre与strs[i]比较。
s4:第二个while，得出pre与strs[i]的共同子字符串。只有在pre是strs[i]的子字符串，且位于开始位置才不执行循环。

notes：默认pre为共同包含最大子字符串，且别必须从第一个字符开始
eg:
Input: ["flower","flow","flight"]
Output: "fl"

Input: ["vflower","flow","flight"]
Output: ""
*/
