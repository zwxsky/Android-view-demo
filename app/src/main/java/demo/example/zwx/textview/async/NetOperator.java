package demo.example.zwx.textview.async;

/**
 * Created by luo on 15-12-14.
 */
public class NetOperator {
    //模拟网络环境

        public void operator(){
            try {
                //休眠1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


}
