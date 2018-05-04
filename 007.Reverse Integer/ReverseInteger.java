class Solution {
    public int reverse(int x) {
        long y = 0;

        int signX = x < 0 ? (-1) : 1 ;
        x = Math.abs(x);

       while( x != 0 )
            {
	        y = y * 10 + x % 10;
	        x = x / 10;
             }

       return (int)( ( y > Integer.MAX_VALUE || y < Integer.MIN_VALUE ? 0 : y ) * signX ) ;
        
    }
}


/*输入一个32位有符号整型数字，求它的倒序数
思路：
s1:判断x符号，并保存
s2:得出x绝对值
s3:循环计算y = y * 10 + x % 10; x = x / 10;
s4:返回y的值，如果溢出返回零
notes:不要忘记最后乘以x符号，以及将long转为int
*/
