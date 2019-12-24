/**
 * 
 */
package Test;

import java.util.*;

/**
 * @author virat
 *
 */
public class test6 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.MIN_VALUE;
		LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=2;i<=5;i++)
        {
            list.add(i*i);
        }
        System.out.print(list.poll()+" "+list.poll());
	}

}
