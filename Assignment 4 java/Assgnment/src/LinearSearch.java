class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int key = 30;
        boolean found = false;

        for (int i : a) {
            if (i == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element Found" : "Not Found");
    }
}
