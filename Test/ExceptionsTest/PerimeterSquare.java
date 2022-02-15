package Test.ExceptionsTest;

public class PerimeterSquare {

    public void getPerimeter(String str) throws PerimeterException {

        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(side);
        }catch (NumberFormatException e) {
            throw new PerimeterException("String is incorrect", e);
        }
        catch (PerimeterException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
