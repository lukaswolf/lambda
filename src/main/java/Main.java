
    @java.lang.FunctionalInterface
    interface FunctionalInterface{
        String h(String w1, String w2);

    }

    public class Main {

        private static String fun(FunctionalInterface fi ){
            String result =" joined strings: " + fi.h("dominika" ,"ola");
            return result;
        }


        public static void main(String[] args) {
//        FunctionalInterface fi = (a,b) ->a + "," + b;
//        System.out.println(fi.h("ania","ma"));
            System.out.println(fun((a,b) -> a + " :" +b));

        }
    }


