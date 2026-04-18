import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
	int b = 1;
	int c = a + b;

	int sum = 0;
	while (c < 40000) {
	    if (c % 2 == 0) sum += c;
	    a = b;
	    b = c;
	    c = a + b;
	}

	System.out.println(sum);
    }
}
