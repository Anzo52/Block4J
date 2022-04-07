import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import java.lang.String;
import java.lang.*;
import java.util.concurrent.ExecutionException;

public class BlockNum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Supply node to web3j variable
        Web3j web3j = Web3j.build(new HttpService("YOUR_ENDPONT_OR_NODE_URL"));  // You must supply your own endpoint or node url
        EthBlockNumber result = web3j.ethBlockNumber().sendAsync().get();  // sends async request to the node
        String blockNum =  result.getBlockNumber().toString();
        System.out.println("Block Number: " + blockNum);
        web3j.shutdown();  // close the connection

    }
}
