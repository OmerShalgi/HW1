public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        for (int i =0; i < Integer.parseInt(String.valueOf(args[0])); i++)
        {
            approxPi += 4.0 / (2 * i + 1) * Math.pow(-1, i);
        }

        
        System.out.println(approxPi + " " + actualPi);
    }
}
