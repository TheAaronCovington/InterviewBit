/* DESCRIPTION:  Given a list of non negative integers, arrange them such that they form the largest number.
For example:
Given [3, 30, 34, 5, 9], the largest formed number is 9534330.  The result may be very large, so you need to return a string
instead of an integer.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Numerics;
using System.Collections;

namespace InterviewBit
{
    class Program
    {
        static String largestNumber(int[] A) {
            string[] B = new string[A.Length];
            for (int i = 0; i < A.Length; i++) {
                B[i] = A[i] + "";
            }
            Array.Sort(B, delegate(string o1, string o2){
                string num1 = "" + o1 + o2;
                string num2 = "" + o2 + o1;
                return -num1.CompareTo(num2);
            });
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < B.Length; i++) {
                result.Append(B[i]);
            }
            if (result[0] == '0') {
                result.Clear();
                result.Append("0");
            }
            return result.ToString();
        }
        static void Main(string[] args) {
            int[] A = {0, 0, 0, 0, 0 }; //9534330
            Console.WriteLine(largestNumber(A));         
        }
    }
}
