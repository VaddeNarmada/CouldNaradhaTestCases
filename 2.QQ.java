class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
