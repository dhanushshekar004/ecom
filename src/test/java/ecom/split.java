package ecom;

import java.util.HashMap;
import java.util.HashSet;

public class split {
	public static void main(String[] args) {
		
		
		String s="\"EXEC33781\",\"EXEC33769\",\"EXEC33762\",\"EXEC33753\",\"EXEC33743\",\"EXEC33734\",\"EXEC33727\",\"EXEC33717\",\"EXEC33702\",\"EXEC33701\",\"EXEC33692\",\"EXEC33682\",\"EXEC33675\",\"EXEC33662\",\"EXEC33651\",\"EXEC33642\",\"EXEC33636\",\"EXEC33628\",\"EXEC33622\",\"EXEC33616\",\"EXEC33610\",\"EXEC33602\",\"EXEC33597\",\"EXEC33591\",\"EXEC33587\",\"EXEC33575\",\"EXEC33562\",\"EXEC33561\",\"EXEC33559\",\"EXEC33549\",\"EXEC33543\",\"EXEC33535\",\"EXEC33525\",\"EXEC33516\",\"EXEC33509\",\"EXEC33502\",\"EXEC33495\",\"EXEC33487\",\"EXEC33482\",\"EXEC33476\",\"EXEC33469\",\"EXEC33461\",\"EXEC33454\",\"EXEC33453\",\"EXEC33449\",\"EXEC33447\",\"EXEC33442\",\"EXEC33440\",\"EXEC33434\",\"EXEC33429\",\"EXEC33421\",\"EXEC33412\",\"EXEC33404\",\"EXEC33398\",\"EXEC33391\",\"EXEC33385\",\"EXEC33379\",\"EXEC33373\",\"EXEC33365\",\"EXEC33360\",\"EXEC33354\",\"EXEC33347\",\"EXEC33341\",\"EXEC33340\",\"EXEC33332\",\"EXEC33327\",\"EXEC33323\",\"EXEC33319\",\"EXEC33316\",\"EXEC33312\",\"EXEC33306\",\"EXEC33297\",\"EXEC33291\",\"EXEC33287\",\"EXEC33281\",\"EXEC33280\",\"EXEC33275\",\"EXEC33269\",\"EXEC33263\",\"EXEC33258\",\"EXEC33256\",\"EXEC33249\",\"EXEC33240\",\"EXEC33229\",\"EXEC33217\",\"EXEC33208\",\"EXEC33197\",\"EXEC33188\",\"EXEC33180\",\"EXEC33172\",\"EXEC33162\",\"EXEC33150\",\"EXEC33139\",\"EXEC33131\",\"EXEC33123\",\"EXEC33116\",\"EXEC33110\",\"EXEC33098\",\"EXEC33086\",\"EXEC33079\",\"EXEC33070\",\"EXEC33061\",\"EXEC33055\",\"EXEC33053\",\"EXEC33043\",\"EXEC33030\",\"EXEC33022\",\"EXEC33011\",\"EXEC33002\",\"EXEC32997\",\"EXEC32986\",\"EXEC32985\",\"EXEC32977\",\"EXEC32974\",\"EXEC32960\",\"EXEC32951\",\"EXEC32944\",\"EXEC32950\",\"EXEC32933\",\"EXEC32927\",\"EXEC32921\",\"EXEC32918\",\"EXEC32907\",\"EXEC32898\",\"EXEC32886\",\"EXEC32876\",\"EXEC32863\",\"EXEC32857\",\"EXEC32849\",\"EXEC32839\",\"EXEC32831\",\"EXEC32829\",\"EXEC32819\",\"EXEC32813\",\"EXEC32811\",\"EXEC32802\",\"EXEC32795\",\"EXEC32788\",\"EXEC32785\",\"EXEC32777\",\"EXEC32768\",\"EXEC32762\",\"EXEC32758\",\"EXEC32756\",\"EXEC32748\",\"EXEC32743\",\"EXEC32735\",\"EXEC32730\",\"EXEC32722\",\"EXEC32714\",\"EXEC32709\",\"EXEC32704\",\"EXEC32700\",\"EXEC32691\",\"EXEC32686\",\"EXEC32681\",\"EXEC32675\",\"EXEC32669\",\"EXEC32664\",\"EXEC32658\",\"EXEC32653\",\"EXEC32648\",\"EXEC32646\",\"EXEC32640\",\"EXEC32635\",\"EXEC32625\",\"EXEC32621\",\"EXEC32615\",\"EXEC32609\",\"EXEC32601\",\"EXEC32596\",\"EXEC32591\",\"EXEC32586\",\"EXEC32582\",\"EXEC32577\",\"EXEC32574\",\"EXEC32569\",\"EXEC32562\",\"EXEC32558\",\"EXEC32555\",\"EXEC32548\",\"EXEC32542\",\"EXEC32535\",\"EXEC32531\",\"EXEC32527\",\"EXEC32524\",\"EXEC32519\",\"EXEC32510\",\"EXEC32507\",\"EXEC32503\",\"EXEC32494\",\"EXEC32487\",\"EXEC32480\",\"EXEC32479\",\"EXEC32477\",\"EXEC32473\",\"EXEC32466\",\"EXEC32462\",\"EXEC32453\",\"EXEC32445\"";
HashSet<String> aa=new HashSet<>();
s.replaceAll("\"", " ");
String[] as = s.split(",");



for (String object : as) {
	System.out.println(object);
}

	}

}