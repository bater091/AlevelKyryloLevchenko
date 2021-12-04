package com.levchenko.hw12;

public class CustomExceptionCatch {
    public void trowCustomException1() throws Exception {

        throw new CustomException1();


    }

    public void trowCustomException2() throws Exception {
        throw new CustomException2();
    }

    public void trowCustomException3() throws Exception {
        throw new CustomException3();
    }

    public void trowCustomExceptions() throws Exception {
        trowCustomException1();
        trowCustomException2();
        trowCustomException3();
    }

    public static void main(String[] args) throws Exception {
        CustomExceptionCatch customExceptionCatch = new CustomExceptionCatch();
        try {
            customExceptionCatch.trowCustomExceptions();
        } catch (CustomException1 | CustomException2 | CustomException3 exception) {
            exception.printStackTrace();

        }
    }
}
