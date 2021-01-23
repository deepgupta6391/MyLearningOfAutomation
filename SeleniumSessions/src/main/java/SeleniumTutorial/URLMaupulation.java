package SeleniumTutorial;

public class URLMaupulation {

	public static void main(String[] args) {
		String url="javascript:void(openWin('https://www.crmpro.com/system/help.cfm?action=subtoc&sub=loadcompany', 'helpwin', 'width=400,height=400,resizable,scrollbars,statusbar'))";

		int startIndex=url.indexOf("http");
		int endIndex=url.indexOf(',');
		System.out.println(url.substring(startIndex,endIndex-1));

	}

}
