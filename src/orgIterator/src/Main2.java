
public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("직급별 정렬");
		HanbatOrg hanbat_rank = new HanbatOrg();
		SoltIterator rank_sort = new RankSolt(hanbat_rank.getMenuItems());
		PrintIter print = new PrintIter(rank_sort.createIterator());
		print.printMenu();
		
		System.out.println("연차별 정렬");
		SoltIterator anuuel_sort = new AnuuelSolt(hanbat_rank.getMenuItems());
		print.setSolt(anuuel_sort.createIterator());
		print.printMenu();
	}
}