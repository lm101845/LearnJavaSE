// x和y的关系满足如下：
// 如果x >= 3，那么y = 2x + 1;
// 如果-1 < x < 3，那么y = 2x;
// 如果x <= -1，那么y = 2x – 1;
public class Demo04IfElseExt {
	public static void main(String[] args) {
		int x = -10;
		int y;
		//y没有赋值，不赋值的情况不能使用，但是没关系，根据下面的3种情况，选一种给它赋值即可。
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (-1 < x && x < 3) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		System.out.println("结果是：" + y);
	}
}