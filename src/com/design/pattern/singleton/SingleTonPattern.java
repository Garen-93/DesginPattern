package com.design.pattern.singleton;

public class SingleTonPattern {


    private static SingleTonPattern instance;

    private SingleTonPattern() {

    }

    /**
     * 使用双重检查进一步做了优化，可以避免整个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率
     * <p>
     * 在方法上加synchronized同步锁或是用同步代码块对类加同步锁，此种方式虽然解决了多个实例对象问题，
     * 但是该方式运行效率却很低下，下一个线程想要获取对象，就必须等待上一个线程释放锁之后，才可以继续运行。
     *
     * @return
     */
    public static SingleTonPattern getInstance() {
        if (instance == null) {                     //双重验证
            synchronized (SingleTonPattern.class) {
                if (instance == null) {
                    instance = new SingleTonPattern();
                }
            }
        }
        return instance;
    }


    public void getSay() {
        System.out.println("I'am is SingleTon! hashcode--->" + instance.hashCode());
    }
}
