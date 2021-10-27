
public class Main {
	public static void main(String[] args) {
		// 5列のピラミッド
		for (int i = 0; i < 5; i++) {
			// 空白
			for (int j = 0; j < 5 - (i + 1); j++ ) {
				System.out.print(" ");
			}
			// アスタリスクの数
			for (int s = 0; s < (i + 1) * 2 - 1; s++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println(" ");

		// 10段 逆ピラミッド
		for (int i = 0; i < 10; i++) {
			// 空白
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// アスタリスクの数
			for (int s = 0; s < (10 - i) * 2 - 1; s++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
