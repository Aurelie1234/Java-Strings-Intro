

 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String A=sc.next();
String B=sc.next();
/* Enter your code here. Print output to STDOUT. */
System.out.println(A.length()+B.length());
int get_val = A.compareTo(B);
if (get_val > 0) {
System.out.println("Yes");}
else {
System.out.println("No");
}
String firstLetter = A.substring(0, 1);
String firstLetter2 = B.substring(0, 1);
String remainingLetters = A.substring(1, A.length());
String remainingLetters2 = B.substring(1, B.length());
firstLetter = firstLetter.toUpperCase();
firstLetter2 = firstLetter2.toUpperCase();
System.out.println(firstLetter+remainingLetters + " " + firstLetter2+remainingLetters2);
}
}
