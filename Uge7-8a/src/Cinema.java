public class Cinema {
    //public static void main(String[] args) {
        /*Cinema c = new Cinema(new int[]{6,5,4,3,3,7,10});
        c.booking(1, 2);
        c.booking(3, 4);
        c.release(3, 4);
        System.out.println("Rows: " +c.rows());
        System.out.println("Seats on row 5: " +c.seatsOnRow(5));
        System.out.println("Total number of seats: " + c.seats());
        System.out.println("Total number of available seats: " +c.vacancies());
        for (int i = 0; i < c.rows(); i++) {
            System.out.println("Avalable seats on row " + i + ": " + c.rowVacancies(i));
        }
        System.out.println(c);
        Cinema c1 = new Cinema(new int[]{6,5,4,3,3,7,10});
		c1.booking(1, 2);
		c1.booking(3, 4);
		c1.release(3, 4);
		c1.booking(-1, 0);
		c1.booking(7, 0);
		c1.booking(1, 7);
		c1.booking(1, -1);
		System.out.println(c1.seatsOnRow(7));
		System.out.println(c1.seatsOnRow(-1));
		System.out.println(c1.rowVacancies(-1));
		System.out.println(c1.rowVacancies(7));
    }*/
    private int[][] rows;
    public Cinema(int[] seatsOnRow){
        rows = new int[seatsOnRow.length][];
        for (int i = 0; i < seatsOnRow.length; i++) {
            rows[i] = new int[seatsOnRow[i]];
        }
    }
    public int rows(){
        return rows.length;
    }
    public int seatsOnRow(int row){
        if (row < 0 || row > rows.length - 1)
            return 0;
        return rows[row].length;
    }
    public int seats(){
        int seats = 0;
        for (int i = 0; i < rows.length; i++) {
            seats += seatsOnRow(i);
        }
        return seats;
    }
    public int rowVacancies(int row){
        int vacant = 0;
        if (row < 0 || row > rows.length - 1)
            return 0;
        for (int i = 0; i < rows[row].length; i++) {
            if (rows[row][i] == 0)
                vacant += 1;
        }
        return vacant;
    }
    public int vacancies(){
        int vacancies = 0;
        for (int i = 0; i < rows.length; i++) {
            vacancies += rowVacancies(i);
        }
        return vacancies;
    }
    public void booking(int row, int seat){
        if (row < 0 || seat < 0 || row > rows.length - 1 || seat > rows[row].length)
            return;
        rows[row][seat] = 1;
    }
    public void release(int row, int seat){
        if (row < 0 || seat < 0 || row > rows.length - 1 || seat > rows[row].length)
            return;
        rows[row][seat] = 0;
    }
    public String toString(){
        for (int[] i: rows) {
            for (int j: i) {
                if(j == 0)
                    System.out.print('0');
                else
                    System.out.print('#');
            }
            System.out.print("\n");
        }
        return "";
    }
}