package com.caul.webapp.taobaodemo;

import net.sf.json.JSONObject;

import com.caul.core.utils.StringHelper;
import com.caul.webapp.taobaodemo.utils.AppConstants;
import com.caul.webapp.taobaodemo.utils.ResponseAnalyser;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.request.ItempropsGetRequest;
import com.taobao.api.request.TradeAmountGetRequest;
import com.taobao.api.request.UserSellerGetRequest;

public class DemoTest {
	
	private static String sessionKey = "6101225061f0928247c0d301af48df272177d5deb1234203643570736";

	public static void main(String[] args) {
		testTradeAmount();
		
	}
	
	private static void testMain(TaobaoRequest request){
		TaobaoClient client = new DefaultTaobaoClient(AppConstants.URL_SERVER_SANDBOX, AppConstants.APP_KEY_SANDBOX,
				AppConstants.APP_SECRET_SANDBOX);
		try {
			TaobaoResponse response = client.execute(request , sessionKey);
			String key = StringHelper.convertFieldName2ColName(response.getClass().getSimpleName()).toLowerCase();
			JSONObject bodyJson = ResponseAnalyser.getBody(response);
			JSONObject megJson = bodyJson.getJSONObject(key);
			System.out.println(megJson.toString());
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}

	private static void testSeller() {
		UserSellerGetRequest req=new UserSellerGetRequest();
		req.setFields("nick,sex");
		testMain(req);
	}
	
	private static void testItemProps(){
		ItempropsGetRequest req=new ItempropsGetRequest();
		req.setFields("pid,name,must,multi,prop_values");
		req.setCid(44343L);
		req.setPid(3232L);
		req.setParentPid(4834L);
		req.setIsKeyProp(true);
		req.setIsSaleProp(true);
		req.setIsColorProp(true);
		req.setIsEnumProp(true);
		req.setIsInputProp(true);
		req.setIsItemProp(true);
		req.setChildPath("3932:13221;2113:2345");
		req.setType(1L);
		req.setAttrKeys("item_must_image");
		testMain(req);
	}
	
	
	private static void testTradeAmount(){
		TradeAmountGetRequest req=new TradeAmountGetRequest();
		req.setTid(123456L);
		req.setFields("tid,oid,alipay_no,total_fee,post_fee");
		testMain(req);
	}
}
