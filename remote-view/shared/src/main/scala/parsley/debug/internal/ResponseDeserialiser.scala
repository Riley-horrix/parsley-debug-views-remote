package parsley.debug.internal

import upickle.default.{ReadWriter => RW, *}

/**
  * Represents a generic response from the remote view.
  * 
  * By adding in the optional fields, that allows adding of arbitrary data, without
  * breaking back compatibility.
  *
  * @param message String response message from the remote view.
  * @param skipBreakpoint How many breakpoints to skip after this breakpoint (not required).
  */
case class RemoteViewResponse(message: String, skipBreakpoint: Option[Int] = None)

object RemoteViewResponse {
  implicit val rw: RW[RemoteViewResponse] = macroRW
}