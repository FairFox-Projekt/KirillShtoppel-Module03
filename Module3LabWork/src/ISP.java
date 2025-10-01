//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа Interface Segregation Principle, ISP:
interface IWorker {
    void work();
}
interface IEat {
    void eat();
}
interface ISleep {
    void sleep();
}
class HumanWorker implements IWorker, IEat, ISleep {
    public void work() {}
    public void eat() {}
    public void sleep() {}
}
class RobotWorker implements IWorker {
    public void work() {}
}


class Student implements IWorker, IEat {
    public void eat() {}
    public void work() {}
    }
