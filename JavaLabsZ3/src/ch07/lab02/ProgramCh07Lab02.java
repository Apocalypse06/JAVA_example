package ch07.lab02;
//�Ч󥿥��{�������~
public class ProgramCh07Lab02 {
	public static void main(String[] args) {
		// ���D�e����������k���`��
		String url_1 = "http://www.railway.gov.tw/pic/big_banner_160_172.jpg";
		String url_2 = "http://www.railway.gov.tw";
		String url_3 = "train.gif";
		System.out.println(getFileName(url_1));
		System.out.println(getFileName(url_2));
		System.out.println(getFileName(url_3));
	}

	public static String getFileName(String n) {
		return "����ɦp�G�ݨ즹�T���A==>ERROR";
	}
}