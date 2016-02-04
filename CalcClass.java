/*
���������� ������������ ����� ������
*/
public class CalcClass {
	// ��������� ����������
	private int result;
	// ������� ��������� @param params - ��������� ���������
	public void add( int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	// �������� ��������� @result ����������
	public int getResult(){
		return this.result;
	}
	// �������� ��������� ���������
	public void cleanResult(){
		this.result = 0;
	}
}