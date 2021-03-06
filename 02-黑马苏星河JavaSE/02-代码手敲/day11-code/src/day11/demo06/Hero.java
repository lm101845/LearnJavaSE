package day11.demo06;

/**
 * @author 李明
 * @date 2021年06月15日 15:23
 */


// 游戏当中的英雄角色类
public class Hero {
    private String name;   //英雄名字
    private int age;       //英雄的年龄
    private Weapon weapon;  //英雄的 武器

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "正在用" + weapon.getCode() + "攻击地方");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
