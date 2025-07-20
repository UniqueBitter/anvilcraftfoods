package ltd.mc233

import net.minecraft.client.Minecraft
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

@Mod(Main.ID) // 注解表示这是一个 NeoForge 模组，ID 为 anvilcraftfoods
@EventBusSubscriber // 注解表示该类订阅了事件总线，可以接收事件
object Main {
    const val ID = "anvilcraftfoods" // 模组唯一标识符

    // 模组的日志记录器，用于输出日志信息
    val LOGGER: Logger = LogManager.getLogger(ID)

    private fun onClientSetup(event: FMLClientSetupEvent) {
    }

    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
    }

    @SubscribeEvent
    fun onCommonSetup(event: FMLCommonSetupEvent) {
    }
}
