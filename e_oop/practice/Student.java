package e_oop.practice;

public class Student {

	int kor, eng, math, sum, rank;
	double avg;
	String[] name = new String[10];
	int num = name.length;
	double[] profiles = { kor, eng, math, sum, avg, rank };

	void pubic(){
		Score sc = new Score();
		sum = sc.kor + 
		int[][] students = new int[name.length][profiles.length+1];
		for(int i =0; i < students.length; i++){
			for(int j =0; j < name.length; j++){
				profiles[0] = Score.kor[j];
				profiles[1] = Score.eng[j];
				profiles[2] = Score.math[j];
				profiles[3] = Score.sum[j];
				profiles[4] = Score.avg[j];
				profiles[5] = Score.rank[j];
																
				
				students[i][j] = profiles[j];
				
				
				profiles[j] = 
				name = "학생" + (i+1);
			int math[j]; 
			
			int sum = kor + eng + math;
			double avg = Math.round(sum / 3.0 *100)/100.0;
			
			
			students[i] = student;
		}
	}

	// Score[][] score= new Score[students.length][3];

	int Students(int kor, int eng, int math) {

		int sum;
		double avg;
		String name;
		int rank;

		for (int i = 0; i < students.length; i++) {

			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			student.sum = student.kor + student.eng + student.math;
			student.avg = Math.round(student.sum / 3.0 * 100) / 100.0;

			students[i] = student;
		}

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}

	}
}
