package test1.model;

public class Score {
	public Score() {}
	public void process(int [] score) {
		System.out.println("국어 점수 : "+score[0]);
		System.out.println("영어 점수 : "+score[1]);
		System.out.println("수학 점수 : "+score[2]);
		
		int tot =0;
		for(int a:score)
		{
			tot += a;
		}
		double avg = tot/score.length;
		if(score[0]>=40&&score[1]>=40&&score[2]>=40&&avg>=60) {
			System.out.println("합격입니다.");
		}else {System.out.println("불합격입니다.");}
	}
}
