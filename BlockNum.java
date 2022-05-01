import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.core.methods.response.EthBlockNumber;

public class BlockNum {
    public static void getBlockNum(String endpoint) {
        // Supply node to web3j variable
        System.out.println("Connecting to node: " + endpoint);
        Web3j web3j = Web3j.build(new HttpService(endpoint));  // You must supply your own endpoint or node url
        System.out.println("Connected to node: " + endpoint);
        System.out.println("Getting block number...");
        EthBlockNumber result = web3j.ethBlockNumber().sendAsync().get();  // sends async request to the node
        String blockNum =  result.getBlockNumber().toString();
        System.out.println("Block number: " + blockNum);
        System.out.println("Shutting down node...");
        web3j.shutdown();  // close the connection
        System.out.println("Goodbye!");
    }
}
