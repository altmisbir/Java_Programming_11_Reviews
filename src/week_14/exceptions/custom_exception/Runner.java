package src.week_14.exceptions.custom_exception;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.getLibraryCard("XXXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage()); //only message
        }

//        try {
//            library.borrow(false);
//        } catch (FailToCheckOutException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Finish");
//
//    }
//}
    }
}