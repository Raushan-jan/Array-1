public class Main {
    public static void main(String[] args) {
        String[] first = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        for (int i = 0; i < first.length; i++) {
        }
        String[] second = new String[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }
        for (String i : second) {
            System.out.println(i);
        }
    }
}
