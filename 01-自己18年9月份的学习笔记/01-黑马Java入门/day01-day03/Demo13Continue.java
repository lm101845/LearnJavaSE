//continue语句的基本使用：只是跳过当前循环的剩余内容，马上开始下一次循环
//break语句是整体都崩掉了，而continue是跳过当前这一次，后面的继续
public class Demo13Continue{
	public static void main(String[] args){
		for(int i =1;i <=10;++i){
			
			//如果当前是第4楼，那么跳过，马上开始后面的5楼
			if(i==4){
				
				continue;	//这行代码一旦执行，那么循环体中剩余内容将被跳过，马上开始下一次循环
			}
			System.out.println(i+"楼到了");
		}
		
	}
}