package zuul;
 
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
 
@Component
public class ZuulLoggingFilter extends ZuulFilter{
 
   	@Override
   	public Object run() throws ZuulException {
          	return null; 
   	}
 
   	@Override
   	public boolean shouldFilter() {
          	return true;  //izmena
   	}

   	@Override
   	public int filterOrder() {
          	return 1; //redosled
   	}
 
   	@Override
   	public String filterType() {
          	return "pre"; //pre after kad se izvrsi
   	}
}
