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
