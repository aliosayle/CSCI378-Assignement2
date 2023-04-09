package palin;

public class Test 
{
    public static boolean isPalindrome(String wr)
    {
        Queue q = new Queue();
        Stack s = new Stack();
        int md = wr.length() / 2;

        for(int i = 0; i <= md; i++)
            q.enqueue(wr.charAt(i));

        for(int i = md; i < wr.length(); i++)
            s.push(wr.charAt(i));

        for(int i = 0; i < md; i++)
        {
            if (q.dequeue() != s.pop())
            return false;
        }

        return true;
        
    }
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "level";
        
        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
        System.out.println(str3 + " is a palindrome: " + isPalindrome(str3));
    }
}
