package Chapter_16_a_01;

/*Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
list of the last occurrence of that value, or 1 if the value is not found in the list. For example, if a variable list
stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
If the call had instead been list.lastIndexOf(3), the method would return –1.
*/


public class Exercise_04_a
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();

        list.add(3);
        list.add(28);
        list.add(22);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(8);
        list.add(4);

        lastIndexOf(list,4);

    }
    public static void lastIndexOf (LinkedIntList list, int value)
    {
        int acc = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if(value == list.get(i))
            {
                acc = i;
            }

        }
        System.out.println(acc);
    }

}
