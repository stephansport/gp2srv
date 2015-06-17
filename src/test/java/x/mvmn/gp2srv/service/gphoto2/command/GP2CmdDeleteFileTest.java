package x.mvmn.gp2srv.service.gphoto2.command;

import junit.framework.TestCase;

import org.junit.Test;

import x.mvmn.gp2srv.service.gphoto2.GPhoto2CommandResult;

public class GP2CmdDeleteFileTest extends MockGPhoto2ExecTest {
	@Test
	public void testParseResult() throws Exception {
		final GPhoto2CommandResult<Object> cmd = MOCK_GPHOTO2_COMMAND_SERVICE.executeCommand(new GP2CmdDeleteFile("/", 1, LOGGER));
		TestCase.assertEquals("", cmd.getStandardOutput());
		TestCase.assertEquals(0, cmd.getExitCode());
	}
}