package d_array;

public class Score{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[]{"김민지", "서주형", "최윤성", "변형균", "김두환", "현유진", "김현슬", 
				"이광렬", "박예진", "강건우", "명민호", "박상영", "이휘로", "김현태", "최영준", "정영인",
				"정유진", "공슬기", "김이현", "전윤주", "전재수", "유은지"};
		
		String[] subject = new String[]{"국어\t","영어\t","수학\t", "사회\t","과학\t","oacle\t","java\t"};
		int[][] scores = new int[name.length][subject.length];
		int[] sum = new int[scores.length]; 
		double[] avg = new double[scores.length]; 

		for(int i =0; i<scores.length; i++){
			for(int j=0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*101);
			}
		}	
		
		 for(int i =0; i < scores.length; i++){ 
			  for(int j=0; j<scores[i].length; j++){ 
				  sum[i] += scores[i][j];
			 }
		avg[i] = Math.round((double)sum[i] / scores[i].length*10)/10; //소수 첫째짜리. 반올림. 
//		System.out.println("합계 " + sum[i] + " / 평균 : " + avg[i]);
		}
		 int[] rank = new int[sum.length];
			for(int i = 0; i < rank.length; i++){
				rank[i] = 1;
			}
			for(int i = 0; i <sum.length; i++){
				for(int j =0; j <sum.length; j++){
					if(sum[i]<sum[j]){
						rank[i]++; 		
					}
				}
			}
//			System.out.println(Arrays.toString(rank));

		
	int[] subsum = new int[subject.length];
	double[] subavg = new double[subject.length];
	int count=0;
		for(int i =0; i < subject.length; i++){
			count =0;
			for(int j=0; j < name.length; j++){
				count += scores[j][i];
				subsum[i]= count;
				}subavg[i] = Math.round((double)subsum[i] / name.length*10)/10;
		}

		System.out.println("\t국어" + "\t영어" +"\t수학" +"\t사회" +"\t과학" +"\toracle" +"\tjava" + "\t합계" +"\t평균" +"\t석차");
		
		String[] pscores = new String[name.length];
		for(int i =0; i<name.length; i++){
			System.out.print(name[i]);
			for(int j=0; j < scores[i].length; j++){
				pscores[i] = "\t" + scores[i][j];
				System.out.print(pscores[i]);
			}System.out.println("\t"+ sum[i] + "\t"+ avg[i] + "\t"+ rank[i]);
		}			System.out.print("과목합계"); 
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t" + subsum[i]);
		}System.out.println( );
		System.out.print("과목평균"); 
		for(int i = 0; i < subject.length; i++){
			System.out.print("\t" + subavg[i]);
		}

	}			

}
