public class PracticeProblem {

	public static void main(String args[]) {

	}
    /**
         * Searches an int array for the given number
         *
         * @param array  The int array to search
         * @param number The number to find
         * @return The index of the first occurrence, or -1 if not found
         */
        public static int find(int[] array, int number) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        /**
         * Searches a String array for the given String
         *
         * @param array  The String array to search
         * @param string The String to find
         * @return The index of the last occurrence, or -1 if not found
         */
        public static int findLast(String[] array, String string) {
            int lastIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(string)) {
                    lastIndex = i;
                }
            }
            return lastIndex;
        }

        /**
         * Searches a char array for the given char
         *
         * @param array     The char array to search
         * @param character The char to find
         * @return The index of the second occurrence, or first if only one exists, or -1 if not found
         */
        public static int findSecond(char[] array, char character) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == character) {
                    counter++;
                    if (counter == 2) {
                        return i;
                    }
                    if (counter == 1 && i == array.length - 1) {
                        // Only one occurrence found and we're at the end
                        return i;
                    }
                }
            }
            // If we found exactly one occurrence, return its index
            if (counter == 1) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == character) {
                        return i;
                    }
                }
            }
            return -1;
        }

}
