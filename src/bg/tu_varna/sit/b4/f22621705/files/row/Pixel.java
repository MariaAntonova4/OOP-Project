package bg.tu_varna.sit.b4.f22621705.files.row;

public class Pixel {
    private int number;

    public Pixel(int number) {
        this.number = number;
    }

    /**
     * the method returns the number of the pixel
     * @return the number of the pixel
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number the number that has to be saved
     *               the method writes the pixel
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
