public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) {
            if (args.length > 0)
            {
                char firstChar = args[i].charAt(0);
                if(firstChar % 5 == 0)
                {
                    System.out.println(firstChar);
                }
            }
        }        
    }
}
