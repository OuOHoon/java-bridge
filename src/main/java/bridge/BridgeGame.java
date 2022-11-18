package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private int playerPos;
    private final int bridgeSize;

    public BridgeGame(int bridgeSize) {
        this.bridgeSize = bridgeSize;
    }

    public void init(int bridgeSize) {
        this.playerPos = -1;
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     * TODO: Player, Bridge 객체로 리팩토링
     */
    public Boolean move(List<String> bridge, String moving) {
        return bridge.get(++playerPos).equals(moving);
    }

    public Boolean isClear() {
        return playerPos == bridgeSize;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
