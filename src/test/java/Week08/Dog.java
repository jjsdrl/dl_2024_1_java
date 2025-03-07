    package Week08;

    public class Dog extends Animal {

        @Override
        public  void sound() {
            System.out.println("小狗"+super.getName()+"汪汪汪");
        }

        public Dog() {
        }

        public Dog(String name) {
            super(name);
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return super.getName();
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            super.setName(name);
        }

        public String toString() {
            return "Dog{name = " + super.getName() + "}";
        }
    }
