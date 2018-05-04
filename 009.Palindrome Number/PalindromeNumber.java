class Solution {
    public boolean isPalindrome(int x) {
        
if( x < 0 )
	return false;
int y = 0 ;
int xx = x;        

while( x != 0 )
{
	y = y * 10 + x % 10;
	x = x / 10;
}

return ( y==xx ? true : false ) ;
        
    }
}

/*判断一个数字是否是回文数
思路：
s1:判断符号，若是负数，则直接返回false
s2:保存x的值，xx=x
s3:循环得出x回文数
s4:判断是否y xx相等
*/
