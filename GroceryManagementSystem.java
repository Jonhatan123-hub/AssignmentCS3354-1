public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(target + " successfully restocked. New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

}/**
     * Prints all items currently in the inventory.
     * Only prints items whose name is not null.
     *
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        System.out.println("\n--- Inventory List ---");

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {
                System.out.println(
                        "Item: " + names[i] +
                                " | Price: $" + prices[i] +
                                " | Stock: " + stocks[i]);
            }
        }
    }
