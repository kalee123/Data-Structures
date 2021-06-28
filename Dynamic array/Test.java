
public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> list = new DynamicArray<>();

        Integer[] elems = {-76, 45, 66, 3, 54, 33};
        for (int i = 0; i < elems.length; i++) {
            list.add(elems[i]);
        }
        System.out.println(list.getSize());
        System.out.println(list.toString());

        //Removing element
        list.remove(66);
        System.out.println(list.toString());
        
        list.removeAt(0);
        System.out.println(list.toString());

        //Contains
        System.out.println(list.contains(3));

        //indexOf
        System.out.println(list.indexOf(3));

        //clear
        list.clear();
        System.out.println(list.toString());
    }
}