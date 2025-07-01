public class StockShow {
    public static void main(String[] args) {
        String[][] stockData = {
            {"Time", "Stock A", "Stock B", "Stock C"},
            {"09:00", "100", "200", "300"},
            {"10:00", "150", "250", "350"},
            {"11:00", "155", "255", "355"},
            {"12:00", "175", "275", "375"},
            {"13:00", "195", "295", "395"}
        };

        for (int i = 0; i < stockData.length; i++) {
            for (int j = 0; j < stockData[i].length; j++) {
                System.out.print(stockData[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
