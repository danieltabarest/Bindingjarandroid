package md5d07926e20ba779622180ee66bd3a1cf6;


public class OpenTokViewRenderer
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.ViewRenderer
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.SimpleExoPlayer.VideoListener,
		com.google.android.exoplayer2.Player.EventListener,
		com.google.android.exoplayer2.Player,
		com.kaltura.playkit.Player,
		com.kaltura.playkit.PKEvent,
		com.kaltura.playkit.Player.Settings,
		com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener,
		com.kaltura.playkit.PKEvent.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRenderedFirstFrame:()V:GetInvokeOnRenderedFirstFrameHandler:Com.Google.Android.Exoplayer2.SimpleExoPlayer/IVideoListenerInvoker, ExoPlayer.Core\n" +
			"n_onVideoSizeChanged:(IIIF)V:GetInvokeOnVideoSizeChanged_IIIFHandler:Com.Google.Android.Exoplayer2.SimpleExoPlayer/IVideoListenerInvoker, ExoPlayer.Core\n" +
			"n_onLoadingChanged:(Z)V:GetOnLoadingChanged_ZHandler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onPlaybackParametersChanged:(Lcom/google/android/exoplayer2/PlaybackParameters;)V:GetOnPlaybackParametersChanged_Lcom_google_android_exoplayer2_PlaybackParameters_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onPlayerError:(Lcom/google/android/exoplayer2/ExoPlaybackException;)V:GetOnPlayerError_Lcom_google_android_exoplayer2_ExoPlaybackException_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onPlayerStateChanged:(ZI)V:GetOnPlayerStateChanged_ZIHandler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onPositionDiscontinuity:()V:GetOnPositionDiscontinuityHandler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onRepeatModeChanged:(I)V:GetOnRepeatModeChanged_IHandler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onTimelineChanged:(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;)V:GetOnTimelineChanged_Lcom_google_android_exoplayer2_Timeline_Ljava_lang_Object_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onTracksChanged:(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V:GetOnTracksChanged_Lcom_google_android_exoplayer2_source_TrackGroupArray_Lcom_google_android_exoplayer2_trackselection_TrackSelectionArray_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListenerInvoker, ExoPlayer.Core\n" +
			"n_getBufferedPercentage:()I:GetGetBufferedPercentageHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getBufferedPosition:()J:GetGetBufferedPositionHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getContentPosition:()J:GetGetContentPositionHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentAdGroupIndex:()I:GetGetCurrentAdGroupIndexHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentAdIndexInAdGroup:()I:GetGetCurrentAdIndexInAdGroupHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentManifest:()Ljava/lang/Object;:GetGetCurrentManifestHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentPeriodIndex:()I:GetGetCurrentPeriodIndexHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentPosition:()J:GetGetCurrentPositionHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentTimeline:()Lcom/google/android/exoplayer2/Timeline;:GetGetCurrentTimelineHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentTrackGroups:()Lcom/google/android/exoplayer2/source/TrackGroupArray;:GetGetCurrentTrackGroupsHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentTrackSelections:()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;:GetGetCurrentTrackSelectionsHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getCurrentWindowIndex:()I:GetGetCurrentWindowIndexHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getDuration:()J:GetGetDurationHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_isCurrentWindowDynamic:()Z:GetIsCurrentWindowDynamicHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_isCurrentWindowSeekable:()Z:GetIsCurrentWindowSeekableHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_isLoading:()Z:GetIsLoadingHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_isPlayingAd:()Z:GetIsPlayingAdHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getPlayWhenReady:()Z:GetGetPlayWhenReadyHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_setPlayWhenReady:(Z)V:GetSetPlayWhenReady_ZHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getPlaybackParameters:()Lcom/google/android/exoplayer2/PlaybackParameters;:GetGetPlaybackParametersHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_setPlaybackParameters:(Lcom/google/android/exoplayer2/PlaybackParameters;)V:GetSetPlaybackParameters_Lcom_google_android_exoplayer2_PlaybackParameters_Handler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getPlaybackState:()I:GetGetPlaybackStateHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getRendererCount:()I:GetGetRendererCountHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getRepeatMode:()I:GetGetRepeatModeHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_setRepeatMode:(I)V:GetSetRepeatMode_IHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_addListener:(Lcom/google/android/exoplayer2/Player$EventListener;)V:GetAddListener_Lcom_google_android_exoplayer2_Player_EventListener_Handler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getRendererType:(I)I:GetGetRendererType_IHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_release:()V:GetReleaseHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_removeListener:(Lcom/google/android/exoplayer2/Player$EventListener;)V:GetRemoveListener_Lcom_google_android_exoplayer2_Player_EventListener_Handler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_seekTo:(IJ)V:GetSeekTo_IJHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_seekTo:(J)V:GetSeekTo_JHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_seekToDefaultPosition:()V:GetSeekToDefaultPositionHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_seekToDefaultPosition:(I)V:GetSeekToDefaultPosition_IHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_stop:()V:GetStopHandler:Com.Google.Android.Exoplayer2.IPlayerInvoker, ExoPlayer.Core\n" +
			"n_getAdController:()Lcom/kaltura/playkit/ads/AdController;:GetGetAdControllerHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_isLiveStream:()Z:GetIsLiveStreamHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_isPlaying:()Z:GetIsPlayingHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_getSessionId:()Ljava/lang/String;:GetGetSessionIdHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_getSettings:()Lcom/kaltura/playkit/Player$Settings;:GetGetSettingsHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_getView:()Lcom/kaltura/playkit/player/PlayerView;:GetGetViewHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_addEventListener:(Lcom/kaltura/playkit/PKEvent$Listener;[Ljava/lang/Enum;)V:GetAddEventListener_Lcom_kaltura_playkit_PKEvent_Listener_arrayLjava_lang_Enum_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_addStateChangeListener:(Lcom/kaltura/playkit/PKEvent$Listener;)V:GetAddStateChangeListener_Lcom_kaltura_playkit_PKEvent_Listener_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_changeTrack:(Ljava/lang/String;)V:GetChangeTrack_Ljava_lang_String_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_destroy:()V:GetDestroyHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_onApplicationPaused:()V:GetOnApplicationPausedHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_onApplicationResumed:()V:GetOnApplicationResumedHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_pause:()V:GetPauseHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_play:()V:GetPlayHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_prepare:(Lcom/kaltura/playkit/PKMediaConfig;)V:GetPrepare_Lcom_kaltura_playkit_PKMediaConfig_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_prepareNext:(Lcom/kaltura/playkit/PKMediaConfig;)V:GetPrepareNext_Lcom_kaltura_playkit_PKMediaConfig_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_replay:()V:GetReplayHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_setVolume:(F)V:GetSetVolume_FHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_skip:()V:GetSkipHandler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_updatePluginConfig:(Ljava/lang/String;Ljava/lang/Object;)V:GetUpdatePluginConfig_Ljava_lang_String_Ljava_lang_Object_Handler:Com.Kaltura.Playkit.IPlayerInvoker, BindingJar\n" +
			"n_eventType:()Ljava/lang/Enum;:GetEventTypeHandler:Com.Kaltura.Playkit.IPKEventInvoker, BindingJar\n" +
			"n_setCea608CaptionsEnabled:(Z)Lcom/kaltura/playkit/Player$Settings;:GetSetCea608CaptionsEnabled_ZHandler:Com.Kaltura.Playkit.IPlayerSettingsInvoker, BindingJar\n" +
			"n_setContentRequestAdapter:(Lcom/kaltura/playkit/PKRequestParams$Adapter;)Lcom/kaltura/playkit/Player$Settings;:GetSetContentRequestAdapter_Lcom_kaltura_playkit_PKRequestParams_Adapter_Handler:Com.Kaltura.Playkit.IPlayerSettingsInvoker, BindingJar\n" +
			"n_useTextureView:(Z)Lcom/kaltura/playkit/Player$Settings;:GetUseTextureView_ZHandler:Com.Kaltura.Playkit.IPlayerSettingsInvoker, BindingJar\n" +
			"n_onAudioCapabilitiesChanged:(Lcom/google/android/exoplayer2/audio/AudioCapabilities;)V:GetOnAudioCapabilitiesChanged_Lcom_google_android_exoplayer2_audio_AudioCapabilities_Handler:Com.Google.Android.Exoplayer2.Audio.AudioCapabilitiesReceiver/IListenerInvoker, ExoPlayer.Core\n" +
			"n_onEvent:(Lcom/kaltura/playkit/PKEvent;)V:GetOnEvent_Lcom_kaltura_playkit_PKEvent_Handler:Com.Kaltura.Playkit.IPKEventListenerInvoker, BindingJar\n" +
			"";
		mono.android.Runtime.register ("App9.Droid.OpenTokViewRenderer, App9.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OpenTokViewRenderer.class, __md_methods);
	}


	public OpenTokViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == OpenTokViewRenderer.class)
			mono.android.TypeManager.Activate ("App9.Droid.OpenTokViewRenderer, App9.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public OpenTokViewRenderer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == OpenTokViewRenderer.class)
			mono.android.TypeManager.Activate ("App9.Droid.OpenTokViewRenderer, App9.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public OpenTokViewRenderer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == OpenTokViewRenderer.class)
			mono.android.TypeManager.Activate ("App9.Droid.OpenTokViewRenderer, App9.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onRenderedFirstFrame ()
	{
		n_onRenderedFirstFrame ();
	}

	private native void n_onRenderedFirstFrame ();


	public void onVideoSizeChanged (int p0, int p1, int p2, float p3)
	{
		n_onVideoSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onVideoSizeChanged (int p0, int p1, int p2, float p3);


	public void onLoadingChanged (boolean p0)
	{
		n_onLoadingChanged (p0);
	}

	private native void n_onLoadingChanged (boolean p0);


	public void onPlaybackParametersChanged (com.google.android.exoplayer2.PlaybackParameters p0)
	{
		n_onPlaybackParametersChanged (p0);
	}

	private native void n_onPlaybackParametersChanged (com.google.android.exoplayer2.PlaybackParameters p0);


	public void onPlayerError (com.google.android.exoplayer2.ExoPlaybackException p0)
	{
		n_onPlayerError (p0);
	}

	private native void n_onPlayerError (com.google.android.exoplayer2.ExoPlaybackException p0);


	public void onPlayerStateChanged (boolean p0, int p1)
	{
		n_onPlayerStateChanged (p0, p1);
	}

	private native void n_onPlayerStateChanged (boolean p0, int p1);


	public void onPositionDiscontinuity ()
	{
		n_onPositionDiscontinuity ();
	}

	private native void n_onPositionDiscontinuity ();


	public void onRepeatModeChanged (int p0)
	{
		n_onRepeatModeChanged (p0);
	}

	private native void n_onRepeatModeChanged (int p0);


	public void onTimelineChanged (com.google.android.exoplayer2.Timeline p0, java.lang.Object p1)
	{
		n_onTimelineChanged (p0, p1);
	}

	private native void n_onTimelineChanged (com.google.android.exoplayer2.Timeline p0, java.lang.Object p1);


	public void onTracksChanged (com.google.android.exoplayer2.source.TrackGroupArray p0, com.google.android.exoplayer2.trackselection.TrackSelectionArray p1)
	{
		n_onTracksChanged (p0, p1);
	}

	private native void n_onTracksChanged (com.google.android.exoplayer2.source.TrackGroupArray p0, com.google.android.exoplayer2.trackselection.TrackSelectionArray p1);


	public int getBufferedPercentage ()
	{
		return n_getBufferedPercentage ();
	}

	private native int n_getBufferedPercentage ();


	public long getBufferedPosition ()
	{
		return n_getBufferedPosition ();
	}

	private native long n_getBufferedPosition ();


	public long getContentPosition ()
	{
		return n_getContentPosition ();
	}

	private native long n_getContentPosition ();


	public int getCurrentAdGroupIndex ()
	{
		return n_getCurrentAdGroupIndex ();
	}

	private native int n_getCurrentAdGroupIndex ();


	public int getCurrentAdIndexInAdGroup ()
	{
		return n_getCurrentAdIndexInAdGroup ();
	}

	private native int n_getCurrentAdIndexInAdGroup ();


	public java.lang.Object getCurrentManifest ()
	{
		return n_getCurrentManifest ();
	}

	private native java.lang.Object n_getCurrentManifest ();


	public int getCurrentPeriodIndex ()
	{
		return n_getCurrentPeriodIndex ();
	}

	private native int n_getCurrentPeriodIndex ();


	public long getCurrentPosition ()
	{
		return n_getCurrentPosition ();
	}

	private native long n_getCurrentPosition ();


	public com.google.android.exoplayer2.Timeline getCurrentTimeline ()
	{
		return n_getCurrentTimeline ();
	}

	private native com.google.android.exoplayer2.Timeline n_getCurrentTimeline ();


	public com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups ()
	{
		return n_getCurrentTrackGroups ();
	}

	private native com.google.android.exoplayer2.source.TrackGroupArray n_getCurrentTrackGroups ();


	public com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections ()
	{
		return n_getCurrentTrackSelections ();
	}

	private native com.google.android.exoplayer2.trackselection.TrackSelectionArray n_getCurrentTrackSelections ();


	public int getCurrentWindowIndex ()
	{
		return n_getCurrentWindowIndex ();
	}

	private native int n_getCurrentWindowIndex ();


	public long getDuration ()
	{
		return n_getDuration ();
	}

	private native long n_getDuration ();


	public boolean isCurrentWindowDynamic ()
	{
		return n_isCurrentWindowDynamic ();
	}

	private native boolean n_isCurrentWindowDynamic ();


	public boolean isCurrentWindowSeekable ()
	{
		return n_isCurrentWindowSeekable ();
	}

	private native boolean n_isCurrentWindowSeekable ();


	public boolean isLoading ()
	{
		return n_isLoading ();
	}

	private native boolean n_isLoading ();


	public boolean isPlayingAd ()
	{
		return n_isPlayingAd ();
	}

	private native boolean n_isPlayingAd ();


	public boolean getPlayWhenReady ()
	{
		return n_getPlayWhenReady ();
	}

	private native boolean n_getPlayWhenReady ();


	public void setPlayWhenReady (boolean p0)
	{
		n_setPlayWhenReady (p0);
	}

	private native void n_setPlayWhenReady (boolean p0);


	public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters ()
	{
		return n_getPlaybackParameters ();
	}

	private native com.google.android.exoplayer2.PlaybackParameters n_getPlaybackParameters ();


	public void setPlaybackParameters (com.google.android.exoplayer2.PlaybackParameters p0)
	{
		n_setPlaybackParameters (p0);
	}

	private native void n_setPlaybackParameters (com.google.android.exoplayer2.PlaybackParameters p0);


	public int getPlaybackState ()
	{
		return n_getPlaybackState ();
	}

	private native int n_getPlaybackState ();


	public int getRendererCount ()
	{
		return n_getRendererCount ();
	}

	private native int n_getRendererCount ();


	public int getRepeatMode ()
	{
		return n_getRepeatMode ();
	}

	private native int n_getRepeatMode ();


	public void setRepeatMode (int p0)
	{
		n_setRepeatMode (p0);
	}

	private native void n_setRepeatMode (int p0);


	public void addListener (com.google.android.exoplayer2.Player.EventListener p0)
	{
		n_addListener (p0);
	}

	private native void n_addListener (com.google.android.exoplayer2.Player.EventListener p0);


	public int getRendererType (int p0)
	{
		return n_getRendererType (p0);
	}

	private native int n_getRendererType (int p0);


	public void release ()
	{
		n_release ();
	}

	private native void n_release ();


	public void removeListener (com.google.android.exoplayer2.Player.EventListener p0)
	{
		n_removeListener (p0);
	}

	private native void n_removeListener (com.google.android.exoplayer2.Player.EventListener p0);


	public void seekTo (int p0, long p1)
	{
		n_seekTo (p0, p1);
	}

	private native void n_seekTo (int p0, long p1);


	public void seekTo (long p0)
	{
		n_seekTo (p0);
	}

	private native void n_seekTo (long p0);


	public void seekToDefaultPosition ()
	{
		n_seekToDefaultPosition ();
	}

	private native void n_seekToDefaultPosition ();


	public void seekToDefaultPosition (int p0)
	{
		n_seekToDefaultPosition (p0);
	}

	private native void n_seekToDefaultPosition (int p0);


	public void stop ()
	{
		n_stop ();
	}

	private native void n_stop ();


	public com.kaltura.playkit.ads.AdController getAdController ()
	{
		return n_getAdController ();
	}

	private native com.kaltura.playkit.ads.AdController n_getAdController ();


	public boolean isLiveStream ()
	{
		return n_isLiveStream ();
	}

	private native boolean n_isLiveStream ();


	public boolean isPlaying ()
	{
		return n_isPlaying ();
	}

	private native boolean n_isPlaying ();


	public java.lang.String getSessionId ()
	{
		return n_getSessionId ();
	}

	private native java.lang.String n_getSessionId ();


	public com.kaltura.playkit.Player.Settings getSettings ()
	{
		return n_getSettings ();
	}

	private native com.kaltura.playkit.Player.Settings n_getSettings ();


	public com.kaltura.playkit.player.PlayerView getView ()
	{
		return n_getView ();
	}

	private native com.kaltura.playkit.player.PlayerView n_getView ();


	public void addEventListener (com.kaltura.playkit.PKEvent.Listener p0, java.lang.Enum[] p1)
	{
		n_addEventListener (p0, p1);
	}

	private native void n_addEventListener (com.kaltura.playkit.PKEvent.Listener p0, java.lang.Enum[] p1);


	public void addStateChangeListener (com.kaltura.playkit.PKEvent.Listener p0)
	{
		n_addStateChangeListener (p0);
	}

	private native void n_addStateChangeListener (com.kaltura.playkit.PKEvent.Listener p0);


	public void changeTrack (java.lang.String p0)
	{
		n_changeTrack (p0);
	}

	private native void n_changeTrack (java.lang.String p0);


	public void destroy ()
	{
		n_destroy ();
	}

	private native void n_destroy ();


	public void onApplicationPaused ()
	{
		n_onApplicationPaused ();
	}

	private native void n_onApplicationPaused ();


	public void onApplicationResumed ()
	{
		n_onApplicationResumed ();
	}

	private native void n_onApplicationResumed ();


	public void pause ()
	{
		n_pause ();
	}

	private native void n_pause ();


	public void play ()
	{
		n_play ();
	}

	private native void n_play ();


	public void prepare (com.kaltura.playkit.PKMediaConfig p0)
	{
		n_prepare (p0);
	}

	private native void n_prepare (com.kaltura.playkit.PKMediaConfig p0);


	public void prepareNext (com.kaltura.playkit.PKMediaConfig p0)
	{
		n_prepareNext (p0);
	}

	private native void n_prepareNext (com.kaltura.playkit.PKMediaConfig p0);


	public void replay ()
	{
		n_replay ();
	}

	private native void n_replay ();


	public void setVolume (float p0)
	{
		n_setVolume (p0);
	}

	private native void n_setVolume (float p0);


	public void skip ()
	{
		n_skip ();
	}

	private native void n_skip ();


	public void updatePluginConfig (java.lang.String p0, java.lang.Object p1)
	{
		n_updatePluginConfig (p0, p1);
	}

	private native void n_updatePluginConfig (java.lang.String p0, java.lang.Object p1);


	public java.lang.Enum eventType ()
	{
		return n_eventType ();
	}

	private native java.lang.Enum n_eventType ();


	public com.kaltura.playkit.Player.Settings setCea608CaptionsEnabled (boolean p0)
	{
		return n_setCea608CaptionsEnabled (p0);
	}

	private native com.kaltura.playkit.Player.Settings n_setCea608CaptionsEnabled (boolean p0);


	public com.kaltura.playkit.Player.Settings setContentRequestAdapter (com.kaltura.playkit.PKRequestParams.Adapter p0)
	{
		return n_setContentRequestAdapter (p0);
	}

	private native com.kaltura.playkit.Player.Settings n_setContentRequestAdapter (com.kaltura.playkit.PKRequestParams.Adapter p0);


	public com.kaltura.playkit.Player.Settings useTextureView (boolean p0)
	{
		return n_useTextureView (p0);
	}

	private native com.kaltura.playkit.Player.Settings n_useTextureView (boolean p0);


	public void onAudioCapabilitiesChanged (com.google.android.exoplayer2.audio.AudioCapabilities p0)
	{
		n_onAudioCapabilitiesChanged (p0);
	}

	private native void n_onAudioCapabilitiesChanged (com.google.android.exoplayer2.audio.AudioCapabilities p0);


	public void onEvent (com.kaltura.playkit.PKEvent p0)
	{
		n_onEvent (p0);
	}

	private native void n_onEvent (com.kaltura.playkit.PKEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
